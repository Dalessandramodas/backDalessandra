package back.dalessandra.service.cliente;

import back.dalessandra.DTO.ListaComprasClienteDevedorDTO;
import back.dalessandra.Model.Venda;
import back.dalessandra.DTO.ClienteDevedorDTO;
import back.dalessandra.repository.cliente.ClienteDevedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteDevedorService {

    @Autowired
    ClienteDevedorRepository clienteDevedorRepository;

    public List<ClienteDevedorDTO> listarClientesDevedor(){
        return  clienteDevedorRepository.listarCLientesDevedores();
    }

//    public String updateStatusDevedor(int id,String metodoPagamento){
//      Venda vendaUpadate =  vendaRepository.recuperarDadosVedna(id);
//      vendaUpadate.setFormaPagto(metodoPagamento);
//      vendaRepository.save(vendaUpadate);
//      return "salvo com sucesso";
//    }
    public List<ListaComprasClienteDevedorDTO> listarComprasClienteDevedor(int codVenda){
        return clienteDevedorRepository.listarProdutosClienteDevedor(codVenda);
    }
}
