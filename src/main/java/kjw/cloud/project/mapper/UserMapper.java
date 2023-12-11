package kjw.cloud.project.mapper;

import kjw.cloud.project.domain.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    Integer save(User user);
}
