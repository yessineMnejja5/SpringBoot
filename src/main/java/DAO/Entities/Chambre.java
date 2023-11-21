package DAO.Entities;

import jakarta.persistence.*;
import jakarta.websocket.server.PathParam;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "Chambre")
public class Chambre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idChambre")
    private long id;

    @Column(name="numeroChambre")
    private long nomUniversite;
    @Enumerated(EnumType.STRING)
    private TypeChambre chambre;
}
