package cn.scikth.service.impl;

import cn.scikth.entity.PerEmployee;
import cn.scikth.mapper.PerEmployeeMapper;
import cn.scikth.service.IPerEmployeeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 员工表 服务实现类
 * </p>
 *
 * @author t
 * @since 2024-03-19
 */
@Service
public class PerEmployeeServiceImpl extends ServiceImpl<PerEmployeeMapper, PerEmployee> implements IPerEmployeeService {

}
