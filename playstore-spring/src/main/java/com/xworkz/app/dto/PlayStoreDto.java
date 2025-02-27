package com.xworkz.app.dto;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;


@Getter
@Setter
@AllArgsConstructor
@ToString
@NoArgsConstructor
@Entity
@Table(name = "playstore_details")
@NamedQueries({@NamedQuery(name = "getversionById",query = "SELECT playstore.version FROM PlayStoreDto playstore WHERE playstore.id = :i"),
        @NamedQuery(name = "getdownloadAndVersionById",query = "select playstore.downloads,playstore.version from PlayStoreDto playstore where playstore.id=:id"),
        @NamedQuery(name = "getofferedById",query = "SELECT playstore.offeredBy FROM PlayStoreDto playstore WHERE playstore.id = :i"),
        @NamedQuery(name = "getreleasedOnById",query = "SELECT playstore.releasedOn FROM PlayStoreDto playstore WHERE playstore.id = :i"),
        @NamedQuery(name = "getofferedAndreleasedOnById",query = "select playstore.offeredBy,playstore.releasedOn from PlayStoreDto playstore where playstore.id=:id")})
public class PlayStoreDto {



    @Id
    @GenericGenerator(name = "abhi",strategy = "increment")
    @GeneratedValue(generator = "abhi")
    @Column(name="id")
    private int id;
    @Column(name = "version")
    private String version;
    @Column(name = "downloads")
    private String downloads;
    @Column(name = "releasedOn")
    private String releasedOn;
    @Column(name = "offeredBy")
    private String offeredBy;
    @Column(name = "downloadSize")
    private int downloadSize;
}
