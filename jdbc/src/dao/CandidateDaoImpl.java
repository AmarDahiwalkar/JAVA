package dao;


import java.sql.PreparedStatement;
import static utils.*;

public class CandidateDaoImpl implements CandidateDao{
	// state
		private Connection cn;
		private PreparedStatement pst1;
		public CandidateDaoImpl() {
			super();
		cn =openConnection();	
		
		}
		@Override
		public List<Candidate> getAllCandidates() throws SQLException {
			// TODO Auto-generated method stub
			return null;
		}
		
		
}
