package com.cq.judge.strategy;

import com.cq.model.dto.questionsubmit.JudgeInfo;
import com.cq.model.entity.Question;
import com.cq.model.enums.QuestionSubmitLanguageEnum;
import lombok.Data;

import java.util.List;

/**
 * 判题上下文
 *
 * @author Asce
 * @since 2023/08/16
 */
@Data
public class JudgeContext {

    /**
     * 判题信息
     */
    private JudgeInfo judgeInfo;

    /**
     * 正确输出用例
     */
    private List<String> outputList;

    /**
     * 程序执行输出结果
     */
    private List<String> outputListResult;

    /**
     * 题目
     */
    private Question question;

    /**
     * 语言类型枚举类
     */
    private QuestionSubmitLanguageEnum languageType;

    /**
     * 执行状态 2 - 编译错误 3 - 答案错误
     */
    private Integer status;
}
