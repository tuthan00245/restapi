package net.javaguides.ttk.service.impl;

import lombok.AllArgsConstructor;
import net.javaguides.ttk.dto.InfoDto;
import net.javaguides.ttk.entity.Info;
import net.javaguides.ttk.mapper.InfoMapper;
import net.javaguides.ttk.repository.InfoRepository;
import net.javaguides.ttk.service.InfoService;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class InfoServiceImpl implements InfoService {

    private InfoRepository infoRepository;

    @Override
    public InfoDto getInfo(Long infoId) {
        Info info = infoRepository.findById(infoId).orElseThrow();
        return InfoMapper.mapToInfoDto(info);
    }

    @Override
    public InfoDto updateInfo(Long infoId, InfoDto updatedInfo) {

        Info info = infoRepository.findById(infoId).orElseThrow();

        info.setEmail(updatedInfo.getEmail());
        info.setTitle(updatedInfo.getTitle());
        info.setNameStore(updatedInfo.getNamStore());
        info.setPhoneNumber(updatedInfo.getPhoneNumber());

        Info updatedInfoObj = infoRepository.save(info);

        return InfoMapper.mapToInfoDto(updatedInfoObj);
    }

    @Override
    public InfoDto createInfo(InfoDto infoDto) {
        Info info = InfoMapper.mapToInfo((infoDto));
        Info savedInfo = infoRepository.save(info);
        return InfoMapper.mapToInfoDto(savedInfo);
    }
}
