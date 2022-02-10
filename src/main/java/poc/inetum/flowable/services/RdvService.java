package poc.inetum.flowable.services;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import poc.inetum.flowable.domain.Message;
import poc.inetum.flowable.domain.Rdv;
import poc.inetum.flowable.exception.FunctionalException;
import poc.inetum.flowable.repository.RdvRepository;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

@Service
@Transactional
public class RdvService {

    private RdvRepository rdvRepository;

    public RdvService(RdvRepository rdvRepository) {
        this.rdvRepository = rdvRepository;
    }

    public void getLocalDate(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));
    }
    public Rdv getRDV(Long id) throws FunctionalException {
        Optional<Rdv> rdv = this.rdvRepository.findById(id);
        if(rdv.isPresent())
        return rdv.get();
        return null;
    }

    public Message Refuse(){
        return new Message("RDV Refused !");
    }

    public Message Accepted(Rdv rdv){
        return new Message("Hello, your RDV on " + rdv.getDateRDV()+" will be treated soon :) ");
    }
}
