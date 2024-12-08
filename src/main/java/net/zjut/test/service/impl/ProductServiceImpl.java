package net.zjut.test.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import net.zjut.test.entity.product.Product;
import net.zjut.test.service.ProductService;
import net.zjut.test.mapper.ProductMapper;
import org.springframework.stereotype.Service;

/**
* @author 86173
* @description 针对表【product】的数据库操作Service实现
* @createDate 2024-12-04 15:43:30
*/
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product>
    implements ProductService{

}




