package com.inttom.blog.service.impl;

import com.inttom.blog.entity.MBlog;
import com.inttom.blog.mapper.MBlogMapper;
import com.inttom.blog.service.IMBlogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author inttom
 * @since 2021-06-07
 */
@Service
public class MBlogServiceImpl extends ServiceImpl<MBlogMapper, MBlog> implements IMBlogService {

}
