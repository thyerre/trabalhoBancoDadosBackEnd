<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;

class ClienteController extends Controller
{
    public function index()
    {
        return response(["response"=>"imagem movida com sucesso",'file'=>"imagem"]);
    }

    public function search(Request $request)
    {
        return \App\Cliente::orWhere('nome','LIKE','%'.$request['search'].'%')->
            orWhere('cpf','LIKE','%'.$request['search'].'%')->
            orWhere('telefone','LIKE','%'.$request['search'].'%')->get();
    }

    public function store(Request $request)
    {
        if ($request->hasFile('fileimg')) {
            if($img = Helpers::salveFile($request,'cliente')){
                return response(["response"=>"imagem movida com sucesso",'file'=>$img['file']]);
            }
        }else{
            $request['img'] = $request['fileimg'];
            $request['bo_ativo'] = true;
            $cliente = \App\Cliente::create($request->all());
            if(!$cliente){
                return  response(["response"=>"Erro ao salvar Produto"],400); 
            }
            return response(["response"=>"Salvo com sucesso",'ar'=>$cliente]);
        }
        return response(["response"=>"Error",'ar'=>$cliente]);
    }

    public function show($id)
    {
        $cliente =  \App\Cliente::find($id);
        if(!$cliente){
            return response(["response"=>"cliente não encontrada"],400);
        }
        return $cliente;
    }

    
    public function update(Request $request, $id)
    {
        $cliente =  \App\Cliente::find($id);
        if(!$cliente){
            return response(['response'=>'cliente Não encontrado'],400);
        }
        $cliente = Helpers::processarColunasUpdate($cliente,$request->all());
        
        if(!$cliente->update()){
            return response(['response'=>'Erro ao alterar'],400);
        }
        return response(['response'=>'Atualizado com sucesso']);
        
    }

    public function destroy($id)
    {
        $cliente =  \App\Cliente::find($id);
        if(!$cliente){
            return response(['response'=>'Cliente Não encontrado'],400);
        }
        if(!$cliente->delete()){
            return response(["response"=>"Erro ao deletar"],400);
        }
        return response(['success'=>'Deletado com sucesso']);
    }
}
