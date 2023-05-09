package InprogressToCompleteTest;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
//		String querry =  "select COALESCE(case_status,'') as case_status,COALESCE(sigmify_case_number,'') as sigmify_case_number, COALESCE(auditors_name,'') as auditors_name,COALESCE(case_creation_date,null) as case_creation_date,COALESCE(ticket,'') as ticket,COALESCE(last_action_date,null) as last_action_date,'' as trxno,substring('PR00002463ACT0001' from 0 for 11)as app_code,'N' as has_attachment from v_ibx_details_pending_cases_by_workstream where ws_id in (<PRM0001>) "; 
		String value = "WS005,WS006,WS006";

		String query = "select COALESCE(case_status,'') as case_status,COALESCE(sigmify_case_number,'') as sigmify_case_number,COALESCE(auditors_name,'') as auditors_name,COALESCE(case_creation_date,null) as case_creation_date,COALESCE(ticket,'') as ticket,COALESCE(last_action_date,null) as last_action_date,'' as trxno,substring('PR00002463ACT0001' from 0 for 11)as app_code,'N' as has_attachmentfrom v_ibx_details_pending_cases_by_workstream where ws_id like '<PRM0001>' And auditors_name like '<PRM0002>' ";
		
		String paramCode = "PRM0001";
//		where ws_id like'<PRM0001>'"
		
//		where ws_id in ('WS005', 'WS006', 'WS006') ";
//		replaceStr = <PRM0001>
	
		String queryArr[] = query.split("where");
		
		String newval = "(";
		for (String v : value.split(",")) {
			newval = newval.concat("'" + v + "', ");
		}
		newval = newval.substring(0, newval.length() - 2) + ")";
		
		String newWhereQuery = " where ";
		for(String whereQuery :queryArr[1].split("\\s*(?i)and\\s*")) {
			
			if(whereQuery.contains(paramCode)){
				String whereProperty[] = whereQuery.split("\\s*(?i)like\\s*");
				newWhereQuery = newWhereQuery.concat(whereProperty[0]+" in " + newval);
			}else {
				newWhereQuery = newWhereQuery.concat(whereQuery);
			}
			newWhereQuery = newWhereQuery.concat(" and ");
		}
		
		newWhereQuery = newWhereQuery.substring(0, newWhereQuery.length() - 4);
		query = queryArr[0]+newWhereQuery;
		
		
		
		
		
		
		System.out.println(query);

		
//		System.out.println(query);
	
	}

}