package crm.icet.repository;


import crm.icet.entity.HardwareItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HardwareItemRepository extends JpaRepository<HardwareItemEntity,Integer> {

}
