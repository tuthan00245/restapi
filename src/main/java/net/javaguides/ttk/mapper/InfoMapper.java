package net.javaguides.ttk.mapper;

import net.javaguides.ttk.dto.InfoDto;
import net.javaguides.ttk.entity.Info;

public class InfoMapper {
    public static InfoDto mapToInfoDto(Info info){
      return new InfoDto(
              info.getId(),
              info.getNameStore(),
              info.getPhoneNumber(),
              info.getTitle(),
              info.getEmail()
      );
    };
    public static Info mapToInfo(InfoDto infoDto){
        return new Info(
                infoDto.getId(),
                infoDto.getNamStore(),
                infoDto.getPhoneNumber(),
                infoDto.getTitle(),
                infoDto.getEmail()
        );
    }
}
