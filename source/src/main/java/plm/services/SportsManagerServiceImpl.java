package plm.services;

import java.util.Collection;

import org.springframework.stereotype.Service;

import plm.beans.SportsManager;
import plm.beans.SportsManagerExample;
import plm.mapper.SportsManagerMapper;

@Service
public class SportsManagerServiceImpl implements SportsManagerService{
	
	private final SportsManagerMapper sm;
	public SportsManagerServiceImpl(SportsManagerMapper sm) {
		this.sm = sm;
	}
	
	@Override
	public Collection<SportsManager> getAll() {
		return sm.selectByExample(new SportsManagerExample());
	}
	
}
