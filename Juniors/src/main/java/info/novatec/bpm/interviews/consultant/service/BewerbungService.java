package info.novatec.bpm.interviews.consultant.service;

import org.camunda.bpm.engine.RuntimeService;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class BewerbungService {

	private final RuntimeService runtimeService;
	
}
