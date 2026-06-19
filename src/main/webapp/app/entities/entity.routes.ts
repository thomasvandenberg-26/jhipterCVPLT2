import { Routes } from '@angular/router';

const routes: Routes = [
  {
    path: 'authority',
    data: { pageTitle: 'cvpltApp.adminAuthority.home.title' },
    loadChildren: () => import('./admin/authority/authority.routes'),
  },
  {
    path: 'profil',
    data: { pageTitle: 'cvpltApp.profil.home.title' },
    loadChildren: () => import('./profil/profil.routes'),
  },
  {
    path: 'article',
    data: { pageTitle: 'cvpltApp.article.home.title' },
    loadChildren: () => import('./article/article.routes'),
  },
  {
    path: 'conversation',
    data: { pageTitle: 'cvpltApp.conversation.home.title' },
    loadChildren: () => import('./conversation/conversation.routes'),
  },
  {
    path: 'message',
    data: { pageTitle: 'cvpltApp.message.home.title' },
    loadChildren: () => import('./message/message.routes'),
  },
  {
    path: 'rendez-vous',
    data: { pageTitle: 'cvpltApp.rendezVous.home.title' },
    loadChildren: () => import('./rendez-vous/rendez-vous.routes'),
  },
  {
    path: 'centre-interet',
    data: { pageTitle: 'cvpltApp.centreInteret.home.title' },
    loadChildren: () => import('./centre-interet/centre-interet.routes'),
  },
  /* jhipster-needle-add-entity-route - JHipster will add entity modules routes here */
];

export default routes;
