package Service;

import DAO.Repository.BlocRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service // definir que c'est un bean Spring   bean: ya3mel les instances wahdou
@AllArgsConstructor// pour injecter un bean dans un autre bean
public class BlocService implements  IblocService{
    BlocRepository blocRepository;
}
