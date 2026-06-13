select id,
max(case when month = 'Jan' then revenue end) as jan_revenue,
max(case when month = 'Feb' then revenue end) as feb_revenue,
max(case when month = 'Mar' then revenue end) as mar_revenue,
max(case when month = 'Apr' then revenue end) as apr_revenue,
max(case when month = 'May' then revenue end) as may_revenue,
max(case when month = 'Jun' then revenue end) as jun_revenue,
max(case when month = 'Jul' then revenue end) as jul_revenue,
max(case when month = 'Aug' then revenue end) as aug_revenue,
max(case when month = 'Sep' then revenue end) as sep_revenue,
max(case when month = 'Oct' then revenue end) as oct_revenue,
max(case when month = 'Nov' then revenue end) as nov_revenue,
max(case when month = 'Dec' then revenue end) as dec_revenue
from department
group by id;