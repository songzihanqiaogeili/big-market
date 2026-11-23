package cn.szh.infrastructure.dao.po;

import lombok.Data;

import java.util.Date;

@Data
public class Strategy {
    /** 自增主键 ID */
    private Long id;

    /** 抽奖策略 ID */
    private Long strategyId;

    /** 抽奖策略描述 */
    private String strategyDesc;

    /** 创建时间，插入时默认取数据库当前时间 */
    private Date createTime;

    /** 更新时间，记录变更时由数据库自动更新 */
    private Date updateTime;

}
