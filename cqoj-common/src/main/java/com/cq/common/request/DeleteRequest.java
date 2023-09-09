package com.cq.common.request;

import lombok.Data;

import java.io.Serializable;

/**
 * 删除请求
 *
 * @author Asce
 * @since 2023/07/29
 */
@Data
public class DeleteRequest implements Serializable {

    /**
     * id
     */
    private Long id;

    private static final long serialVersionUID = 1L;
}
