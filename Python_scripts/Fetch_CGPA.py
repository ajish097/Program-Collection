import requests
from bs4 import BeautifulSoup
def set_url(usn):
    if(usn >= 100):
        return 'http://result.vtu.ac.in/cbcs_results2017.aspx?usn=1cr15cs'+str(usn)+'&sem=3'
        return 'http://result.vtu.ac.in/cbcs_results2017.aspx?usn=1cr15cs00'+str(usn)+'&sem=3'
    else:
        return 'http://result.vtu.ac.in/cbcs_results2017.aspx?usn=1cr15cs0'+str(usn)+'&sem=3'

fw = open('stock_data.txt','w')
for usn in range(1,197):
    url = set_url(usn)  
    source_code = requests.get(url)
    plain_text = source_code.text
    soup = BeautifulSoup(plain_text)
    for rows in soup.find_all('span',id = 'lblSGPA'):
        rows = rows.string
            fw.write('1cr15cs00'+str(usn)+"\t"+str(rows))
        elif(usn >= 100):
            fw.write('1cr15cs'+str(usn)+"\t"+str(rows))
        else:
            fw.write('1cr15cs0'+str(usn)+"\t"+str(rows))
        fw.write('\n')

fw.close()
