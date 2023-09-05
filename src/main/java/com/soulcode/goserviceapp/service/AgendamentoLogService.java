package com.soulcode.goserviceapp.service;

import com.soulcode.goserviceapp.domain.AgendamentoLog;
import com.soulcode.goserviceapp.repository.AgendamentoLogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AgendamentoLogService {

    @Autowired
    private AgendamentoLogRepository agendamentoLogRepository;

    public AgendamentoLog create(AgendamentoLog agendamentoLog){
        return agendamentoLogRepository.save(agendamentoLog);
    }

}
