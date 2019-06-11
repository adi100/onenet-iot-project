package com.qmdx00.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @author yuanweimin
 * @date 19/06/10 16:25
 * @description 生产过程数据实体
 */
@Entity
@Table(name = "t_product_data")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductData implements Serializable {
    // 产品编号
    @Id
    private String productId;
    // 产品直径 (mm)
    @Column(name = "diameter", columnDefinition = "double(10,1) default 0.0")
    private Double diameter;
    // 产品长度 (m)
    @Column(name = "length", columnDefinition = "double(10,1) default 0.0")
    private Double length;
    // 产品重量 (kg)
    @Column(name = "weight", columnDefinition = "double(10,1) default 0.0")
    private Double weight;
}
