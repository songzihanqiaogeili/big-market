package cn.szh.infrastructure.dao.po;

import lombok.Data;

import java.util.Date;

@Data
public class StrategyRule {

    /** 自增主键 ID */
    private Long id;

    /** 抽奖策略 ID */
    private Long strategyId;

    /** 抽奖奖品 ID，策略级规则可为空 */
    private Integer awardId;

    /** 规则类型，1 表示策略规则，2 表示奖品规则 */
    private Integer ruleType;

    /** 规则模型标识，例如 rule_random、rule_lock、rule_luck_award */
    private String ruleModel;

    /** 规则配置值 */
    private String ruleValue;

    /** 抽奖规则描述 */
    private String ruleDesc;

    /** 创建时间 */
    private Date createTime;

    /** 更新时间 */
    private Date updateTime;
}