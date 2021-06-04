package com.inttom.user.service.impl;

import com.inttom.user.entity.MUser;
import com.inttom.user.mapper.MUserMapper;
import com.inttom.user.service.IMUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author inttom
 * @since 2021-06-04
 */
@Service
public class MUserServiceImpl extends ServiceImpl<MUserMapper, MUser> implements IMUserService {

}
