package cn.szh.infrastructure.dao.po;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class StrategyAward {

    /** 自增主键 ID */
    private Long id;

    /** 抽奖策略 ID */
    private Long strategyId;

    /** 抽奖奖品 ID */
    private Integer awardId;

    /** 抽奖奖品标题 */
    private String awardTitle;

    /** 抽奖奖品副标题，可为空 */
    private String awardSubtitle;

    /** 奖品库存总量 */
    private Integer awardCount;

    /** 奖品剩余库存 */
    private Integer awardCountSurplus;

    /** 奖品中奖概率，对应数据库的 DECIMAL(6,4) */
    private BigDecimal awardRate;

    /** 从规则配置同步过来的规则模型，可为空 */
    private String ruleModels;

    /** 排序值 */
    private Integer sort;

    /** 创建时间 */
    private Date createTime;

    /** 更新时间 */
    private Date updateTime;
}