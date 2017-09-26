create database jurisoft;
use jurisoft;

create table endereco(
codEnd int auto_increment not null,
ruaEnd varchar (100) not null, 
numeroEnd varchar (6) not null, 
bairroEnd varchar (100) not null, 
cidadeEnd varchar (100) not null, 
ufEnd varchar (2) not null,
primary key (codEnd)
);

create table cliente (
codCli int auto_increment not null,
nomeCli varchar (100) not null, 
sexoCli varchar (1) , 
rendaCli double, 
estadoCivilCli varchar (15) not null, 
naturalidadeCli varchar (100) not null, 
nacionalidadeCli varchar (50), 
filiacaoPaiCli varchar (100), 
filiacaoMaeCli varchar (100), 
cpfCli varchar (15), 
rgCli varchar (15), 
telefoneCli varchar (15) not null, 
telefone2Cli varchar (15), 
emailCli varchar (100), 
cnhCli varchar (15), 
dataNascCli date, 
dataCadastroCli date,
primary key (codCli)
);

create table cliente_endereco(
codCliEnd int auto_increment not null,
codEnd int,
foreign key(codEnd) references endereco (codEnd),
codCli int,
foreign key(codCli) references cliente (codCli),
primary key (codCliEnd)
);

create table advogado (
codAdv int auto_increment not null,
nomeAdv varchar (100) not null, 
sexoAdv varchar (1) not null, 
estadoCivilAdv varchar (15) not null, 
naturalidadeAdv varchar (100) not null, 
nacionalidadeAdv varchar (50) not null, 
cpfAdv varchar (15) not null, 
rgAdv varchar (15) not null, 
telefoneAdv varchar (15) not null, 
telefone2Adv varchar (15),  
emailAdv varchar (100) not null, 
cnhAdv varchar (15), 
dataNascAdv date, 
dataCadastroAdv date,
dataInsOAB date not null,
tipoInsAdv varchar (20) not null,
seccionalAdv varchar (40) not null, 
letraAdv varchar (40) not null, 
inscricaoAdv varchar (100) not null,
rendaAdv float not null,
primary key (codAdv)
);

create table advogado_endereco(
codAdvEnd int auto_increment not null,
codEnd int,
foreign key(codEnd) references endereco (codEnd),
codAdv int,
foreign key(codAdv) references advogado (codAdv),
primary key (codAdvEnd)
);

create table usuario (
codUsu int auto_increment not null,
nomeUsu varchar (40) unique not null,
senhaUsu varchar (100) not null,
primary key(codUsu)
);
INSERT INTO usuario VALUES(1, 'drdelaias',  '3027xuxa');
select*from usuario;

create table processo (
codPro int auto_increment not null,
assuntoPro varchar (40) not null,
descricaoPro varchar (20000) not null,
naturezaPro varchar (40) not null,
numeroPro varchar (40) not null,
nivelPro varchar (40) not null,
tipoAcaoPro varchar (40) not null, 
classificacaoPro varchar (50) not null,
fasePro varchar (20) not null,
instanciaPro varchar (50) not null,
origemPro varchar (50) not null,
situacaoPro varchar (50) not null,
varaPro varchar (40),
primary key (codPro),
codCli int,
foreign key(codCli) references cliente (codCli)
);

create table intimacao (
codInt int auto_increment not null,
dataAudInt date not null,
dataRecebInt date not null,
prazoInt date not null,
resultado varchar (50) not null,
numeroInt varchar (100) not null,
atoInt varchar (100) not null,
processoInt varchar (100) not null,
descricaoInt varchar (500),
rascunhoInt varchar (20000),
primary key (codInt),
codPro int,
foreign key (codPro) references processo (codPro) 
);



select * from cliente;
SELECT max(codCli) as 'Código' FROM cliente;

create view pesquisaIntimacao as 
select 
   intimacao.dataAudInt as 'Data', 
   intimacao.dataRecebInt as Recebimento, 
   intimacao.prazoInt as Prazo, 
   intimacao.resultado as Resultado, 
   intimacao.numeroInt, 
   intimacao.atoInt as Ato, 
   intimacao.processoInt as Processo, 
   intimacao.descricaoInt as Descrição, 
   intimacao.rascunhoInt as Rascunho,
   processo.codPro as 'Cód. Processo',
   cliente.nomeCli as 'Cliente'
from 
   intimacao
inner join processo on processo.codPro = intimacao.codPro 
inner join cliente on cliente.codCli = processo.codCli;

create view pesquisaProcesso as 
select 
   processo.assuntoPro as Assunto, 
   processo.descricaoPro, 
   processo.naturezaPro as Natureza, 
   processo.numeroPro as 'Nº', 
   processo.nivelPro as Nível, 
   processo.tipoAcaoPro as Ação, 
   processo.classificacaoPro as Classificação, 
   processo.fasePro as Fase, 
   processo.instanciaPro as Instância, 
   processo.origemPro as Origem, 
   processo.situacaoPro as Situação, 
   processo.varaPro as Vara,
   cliente.cpfCli as Cliente
from 
   processo
inner join cliente on cliente.codCli = processo.codPro;

create view pesquisaAdvogado as
select
   advogado.nomeAdv as Nome,  
   advogado.naturalidadeAdv as Naturalidade, 
   advogado.nacionalidadeAdv as Nacionalidade, 
   advogado.cpfAdv, 
   advogado.rgAdv as RG, 
   advogado.telefoneAdv as Telefone,  
   advogado.emailAdv as 'E-mail', 
   advogado.dataNascAdv as Nascimento,
   advogado.tipoInsAdv as 'Tipo Inscrição', 
   advogado.seccionalAdv as Seccional, 
   advogado.letraAdv as Letra, 
   advogado.inscricaoAdv as Inscrição,
   endereco.ruaEnd as Rua, 
   endereco.numeroEnd as 'Nº', 
   endereco.bairroEnd as Bairro, 
   endereco.cidadeEnd as Cidade, 
   endereco.ufEnd as UF
from 
   advogado 
inner join advogado_endereco on advogado.codAdv = advogado_endereco.codAdv
inner join endereco on endereco.codEnd = advogado_endereco.codEnd;

create view pesquisaCliente as
select 
   cliente.nomeCli as Nome, 
   cliente.naturalidadeCli as Naturalidade, 
   cliente.nacionalidadeCli as Nacionalidade,
   cliente.cpfCli as CPF, 
   cliente.rgCli as RG, 
   cliente.telefoneCli as Telefone, 
   cliente.emailCli as 'E-mail', 
   cliente.dataNascCli as Nascimento, 
   endereco.ruaEnd as Rua, 
   endereco.numeroEnd as 'Nº', 
   endereco.bairroEnd as Bairro, 
   endereco.cidadeEnd as Cidade, 
   endereco.ufEnd as UF
from 
   cliente
inner join cliente_endereco on cliente.codCli = cliente_endereco.codCli
inner join endereco on endereco.codEnd = cliente_endereco.codEnd;

select * from pesquisacliente;

desc cliente;

alter table cliente change column cpfCli cpfCli varchar (50);

drop view pesquisacliente;

/*create view pesquisaCliente as
select 
   cliente.nomeCli, 
   cliente.sexoCli, 
   cliente.rendaCli, 
   cliente.estadoCivilCli, 
   cliente.naturalidadeCli, 
   cliente.nacionalidadeCli, 
   cliente.filiacaoPaiCli, 
   cliente.filiacaoMaeCli, 
   cliente.cpfCli, 
   cliente.rgCli, 
   cliente.telefoneCli, 
   cliente.telefone2Cli, 
   cliente.emailCli, 
   cliente.cnhCli, 
   cliente.dataNascCli, 
   cliente.dataCadastroCli, 
   endereco.ruaEnd, 
   endereco.numeroEnd, 
   endereco.bairroEnd, 
   endereco.cidadeEnd, 
   endereco.ufEnd
from 
   cliente
inner join cliente_endereco on cliente.codCli = cliente_endereco.codCli
inner join endereco on endereco.codEnd = cliente_endereco.codEnd;*/

delimiter $$
create procedure chamarViews(categoria int, arg varchar(30))
begin
  if (categoria = 0) then
    select * from pesquisaCliente where CPF like concat('%',arg,'%');
    end if;
  if (categoria = 1) then 
    select * from pesquisaAdvogado where cpfAdv like concat('%',arg,'%');
    end if;
  if (categoria = 2) then
    select * from pesquisaProcesso where descricaoPro like concat('%',arg,'%');
    end if;
  if (categoria = 3) then
    select * from pesquisaIntimacao where numeroInt like concat('%',arg,'%');
    end if;
end;
$$ delimiter ;

call chamarViews (0, '007');

select * from cliente;

delimiter $$ 
create function verificarCpf(cpf_cli varchar(15)) returns int
begin
declare cpf int;
  select count(cpf_cli) into cpf from cliente where cpf_cli = cpf_cli; 
return cpf;  
end;
$$ delimiter ;

select verificarCpf('007.337.692-25') as CPF;