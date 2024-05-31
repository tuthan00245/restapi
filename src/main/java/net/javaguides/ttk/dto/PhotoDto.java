package net.javaguides.ttk.dto;

import lombok.*;

import java.io.InputStream;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode(exclude = {"tags","photoUrl"})

public class PhotoDto {

    private String id;
    private String userId;
    private String title;
    private String[] tags;
    private String photoUrl;
    private boolean isPrivate;
    private InputStream content;
}




