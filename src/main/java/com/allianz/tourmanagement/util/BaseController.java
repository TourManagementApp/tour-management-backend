package com.allianz.tourmanagement.util;

import com.allianz.tourmanagement.model.PageDTO;
import com.allianz.tourmanagement.model.requestDTO.BaseFilterRequestDTO;
import com.allianz.tourmanagement.util.dbutil.BaseEntity;
import com.allianz.tourmanagement.util.dbutil.IBaseRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

public abstract class BaseController<
        Entity extends BaseEntity,
        DTO extends BaseDTO,
        RequestDto extends BaseRequestDTO,
        Mapper extends IBaseMapper<Entity, DTO, RequestDto>,
        Repository extends IBaseRepository<Entity>,
        Service extends BaseService<Entity, DTO, RequestDto, Mapper, Repository>> {

    protected abstract Service getService();


    @GetMapping
    public ResponseEntity<List<DTO>> getAll() {
        return new ResponseEntity<>(getService().getAll(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<DTO> save(@RequestBody RequestDto requestDTO) {
        return new ResponseEntity<>(getService().save(requestDTO), HttpStatus.CREATED);
    }

    @PostMapping("/get-all-by-filter")
    public ResponseEntity<PageDTO<DTO>> getAllByPageable(@RequestBody BaseFilterRequestDTO requestDto) {
        return new ResponseEntity<>(getService().getAllByPageable(requestDto), HttpStatus.OK);
    }


    @PutMapping("{uuid}")
    public ResponseEntity<DTO> update(@PathVariable UUID uuid, @RequestBody RequestDto requestDTO) {
        if (getService().update(uuid, requestDTO) != null) {
            return new ResponseEntity<>(getService().update(uuid, requestDTO), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("{uuid}")
    public ResponseEntity<Boolean> deleteByUUID(@PathVariable UUID uuid) {
        Boolean isDeleted = getService().deleteByUUID(uuid);
        if (isDeleted) {
            return new ResponseEntity<>(true, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(false, HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("{uuid}")
    public ResponseEntity<DTO> getByUUID(@PathVariable UUID uuid) {
        DTO dto = getService().getByUUID(uuid);
        if (dto != null) {
            return new ResponseEntity<>(dto, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }

}