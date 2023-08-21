package com.allianz.tourmanagement.model;

import com.allianz.tourmanagement.util.BaseDTO;
import lombok.Data;
import org.springframework.data.domain.Sort;

import java.util.List;

@Data
public class PageDTO<DTO extends BaseDTO> {
    private int number;
    private int size;
    private int totalPages;
    private Long totalElements;
    private boolean hasContent;
    private List<DTO> content;
    private Sort sort;

}