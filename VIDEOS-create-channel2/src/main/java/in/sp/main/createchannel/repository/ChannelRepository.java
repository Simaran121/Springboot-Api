package in.sp.main.createchannel.repository;

import in.sp.main.createchannel.model.Channel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface ChannelRepository extends JpaRepository<Channel, Long> {
}

