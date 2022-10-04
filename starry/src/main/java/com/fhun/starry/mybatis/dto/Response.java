package com.fhun.starry.mybatis.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author FHun
 */
@Data
@AllArgsConstructor
public class Response {

    private Boolean success = true;

    private Object data;

    private String errorCode = null;

    private String errorMessage = null;


    public Response(Object data) {
        this.data = data;
    }


    public Response() {
        this.success = false;
        this.data = null;
        this.errorCode = "500";
        this.errorMessage = "内部错误";
    }
}
