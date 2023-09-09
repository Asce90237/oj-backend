package com.cq.judge.codesandbox;


import com.cq.model.dto.codesandbox.ExecuteCodeRequest;
import com.cq.model.dto.codesandbox.ExecuteCodeResponse;

/**
 * 代码沙箱
 *
 * @author Asce
 * @since 2023/08/15
 */
public interface CodeSandbox {
    /**
     * 执行代码
     *
     * @param executeCodeRequest 执行代码请求
     * @return {@link ExecuteCodeResponse}
     */
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);
}
