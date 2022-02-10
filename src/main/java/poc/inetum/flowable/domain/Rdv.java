package poc.inetum.flowable.domain;

import com.sun.istack.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
public class Rdv implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRDV;

    @NotNull
    private String dateRDV;

    public Rdv(String dateRDV) {
        this.dateRDV = dateRDV;
    }

    public Long getIdRDV() {
        return idRDV;
    }

    public void setIdRDV(Long idRDV) {
        this.idRDV = idRDV;
    }

    public String getDateRDV() {
        return dateRDV;
    }

    public void setDateRDV(String dateRDV) {
        this.dateRDV = dateRDV;
    }
}
