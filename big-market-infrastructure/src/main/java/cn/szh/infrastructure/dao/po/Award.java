package cn.szh.infrastructure.dao.po;

import lombok.Data;

import java.util.Date;

@Data
public class Award {

    /** 自增主键 ID */
    private Long id;

    /** 抽奖奖品 ID，供业务内部使用 */
    private Integer awardId;

    /** 奖品对接标识，用于匹配对应的发奖策略 */
    private String awardKey;

    /** 奖品配置信息 */
    private String awardConfig;

    /** 奖品内容描述 */
    private String awardDesc;

    /** 创建时间 */
    private Date createTime;

    /** 更新时间 */
    private Date updateTime;
}