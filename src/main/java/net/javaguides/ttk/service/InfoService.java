package net.javaguides.ttk.service;

import net.javaguides.ttk.dto.InfoDto;

public interface InfoService {
    InfoDto getInfo(Long infoId);
    InfoDto updateInfo(Long infoId, InfoDto updatedInfo);
    InfoDto createInfo(InfoDto infoDto);
}
