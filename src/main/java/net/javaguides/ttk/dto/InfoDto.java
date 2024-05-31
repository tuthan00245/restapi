package net.javaguides.ttk.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class InfoDto {
    private Long id;
    private String namStore;
    private String title;
    private String phoneNumber;
    private String email;
}
