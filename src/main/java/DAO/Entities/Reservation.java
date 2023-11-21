package DAO.Entities;


import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "Reservation")
public class Reservation {
    @Id
    @Column(name="idReservation")
    private long String;
    @Column(name="anneeUniversitaire")
    private Date anneeUniversitaire;

    @Column(name="estValide")
    private Boolean estValide;

}